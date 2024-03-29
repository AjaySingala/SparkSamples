# broadcast_pysparksql.py
# Does not work with spark-submit. Works from pyspark shell.

import pyspark
from pyspark.sql import SparkSession

spark = SparkSession.builder.appName('ajaysingala.com').getOrCreate()
spark.SparkContext.setLogLevel("ERROR")

states = {"NY":"New York", "CA":"California", "FL":"Florida"}
broadcastStates = spark.sparkContext.broadcast(states)

data = [("James","Smith","USA","CA"),
    ("Michael","Rose","USA","NY"),
    ("Robert","Williams","USA","CA"),
    ("Maria","Jones","USA","FL")
  ]

rdd = spark.SparkContext.parallelize(data)

def state_convert(code):
    return broadcastStates.value[code]

print('-' * 50)
print("result...")
result = rdd.map(lambda x: (x[0],x[1],x[2],state_convert(x[3]))).collect()
print(result)
# result.show(truncate=False)
print('-' * 50)

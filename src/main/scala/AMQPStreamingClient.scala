import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.StreamingContext

class AMQPStreamingClient(
    ssc: StreamingContext,
    storageLevel: StorageLevel = StorageLevel.MEMORY_AND_DISK_2
  ) {

  def createStream(args: Array[String]): Unit = {
    new AMQPReceiverInputDStream(ssc, storageLevel)
  }

}
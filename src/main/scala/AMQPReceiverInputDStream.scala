import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.dstream.ReceiverInputDStream
import org.apache.spark.streaming.receiver.Receiver

class AMQPReceiverInputDStream(
    _ssc: StreamingContext,
    storageLevel: StorageLevel
  ) extends ReceiverInputDStream[String](_ssc) {

  override def getReceiver(): Receiver[String] = {
    new AMQPReceiver(storageLevel)
  }
}

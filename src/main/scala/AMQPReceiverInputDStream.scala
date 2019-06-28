import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.dstream.ReceiverInputDStream
import org.apache.spark.streaming.receiver.Receiver

class AMQPReceiverInputDStream(_ssc: StreamingContext) extends ReceiverInputDStream[String](_ssc) {
  override def getReceiver(): Receiver[String] = ???
}

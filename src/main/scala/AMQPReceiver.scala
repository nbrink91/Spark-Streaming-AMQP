import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.receiver.Receiver

class AMQPReceiver(
    storageLevel: StorageLevel
  ) extends Receiver[String](storageLevel) {

  override def onStart(): Unit = {

  }

  override def onStop(): Unit = {

  }

}

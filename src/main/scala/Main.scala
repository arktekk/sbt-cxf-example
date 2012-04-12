import java.net.URL
import tps.bpel.pingpong.PingPongService

object Main extends App {

  val service = new PingPongService(new URL("http://157.159.110.224:9000/PingPong/services/PingPong"))
  val port = service.getPingPong
  println(port.echoInput("Testing"))

}
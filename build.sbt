seq(cxf.settings : _*)

cxf.wsdls := Seq(cxf.Wsdl(file("src/main/wsdl/PingPong.wsdl"), Nil, None))


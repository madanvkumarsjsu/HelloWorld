package hello

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author mvijayakumar
 * @since 1.0
 */ 
@Controller
@EnableAutoConfiguration
class HelloConfig {
	
	@RequestMapping(Array("/"))
    @ResponseBody
    def home(): String = {
		var retStr:String = "Hello World!"
		println("Hello World!")
		return retStr
	}
}
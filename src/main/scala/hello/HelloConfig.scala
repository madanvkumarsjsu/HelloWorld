package hello

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.ui.Model
import org.springframework.web.bind.annotation._

/**
 * This config class will trigger Spring @annotation scanning and auto configure Spring context.
 *
 * @author saung
 * @since 1.0
 */ 
@Controller
@EnableAutoConfiguration
class HelloConfig {
	
	@RequestMapping(Array("/"))
    @ResponseBody
    def home(model: Model) {
		println("Hello World!")
	}
}
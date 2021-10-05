package br.com.kiluange.springrestapiexemple.controller.filter

import org.slf4j.MDC
import org.springframework.stereotype.Component
import java.util.*
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletResponse

@Component
class MDCFilter : Filter {
    override fun doFilter(
        request: ServletRequest?,
        response: ServletResponse?,
        chain: FilterChain?,
    ) {
        var res:HttpServletResponse = response as HttpServletResponse
        val uuid = UUID.randomUUID().toString()
        MDC.put("x-tid", uuid)
        res.addHeader("X-tid",uuid)
        chain?.doFilter(request, response)
    }
}
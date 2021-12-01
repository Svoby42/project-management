package svoby.spring.projectmanagement.controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class AppErrorController implements ErrorController {

    @GetMapping("/error")
    public String handleError(HttpServletRequest request){
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if(status != null){
            Integer statusInt = Integer.valueOf(status.toString());

            if(statusInt == HttpStatus.NOT_FOUND.value()){
                return "errorpages/error-404";
            }
            else if(statusInt == HttpStatus.INTERNAL_SERVER_ERROR.value()){
                return "errorpages/error-500";
            }
            else if(statusInt == HttpStatus.FORBIDDEN.value()){
                return "errorpages/error-403";
            }

        }

        return "errorpages/error";

    }

    @Override
    public String getErrorPath(){
        return "/error";
    }

}

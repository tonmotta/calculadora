package br.edu.usj.ads.lpii.calculadora;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculadora {

    List<String> historico = new ArrayList<>();
    
    @PostMapping(value="/somar")
    
        public ModelAndView postSomar(@RequestParam String a, @RequestParam String b) {
        
        Double aDouble = Double.valueOf(a);
        Double bDouble = Double.valueOf(b);
        Double resultado = aDouble + bDouble;
        String operacao = a + " + " + b + " = " + resultado;

        historico.add(operacao);
        
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("resultado", operacao);
        return modelAndView; 
    }

    @PostMapping(value="/subtrair")
    
    public ModelAndView postSubtrair(@RequestParam String a, @RequestParam String b) {
    
    Double aDouble = Double.valueOf(a);
    Double bDouble = Double.valueOf(b);
    Double resultado = aDouble - bDouble;
    String operacao = a + " - " + b + " = " + resultado;

    historico.add(operacao);
    
    ModelAndView modelAndView = new ModelAndView("index");
    modelAndView.addObject("resultado", operacao);
    return modelAndView; 
}

@PostMapping(value="/multiplicar")
    
public ModelAndView postMultiplicar(@RequestParam String a, @RequestParam String b) {

Double aDouble = Double.valueOf(a);
Double bDouble = Double.valueOf(b);
Double resultado = aDouble * bDouble;
String operacao = a + " x " + b + " = " + resultado;

historico.add(operacao);

ModelAndView modelAndView = new ModelAndView("index");
modelAndView.addObject("resultado", operacao);
return modelAndView; 
}

@PostMapping(value="/dividir")
    
public ModelAndView postDividir(@RequestParam String a, @RequestParam String b) {

Double aDouble = Double.valueOf(a);
Double bDouble = Double.valueOf(b);
Double resultado = aDouble / bDouble;
String operacao = a + " / " + b + " = " + resultado;

historico.add(operacao);

ModelAndView modelAndView = new ModelAndView("index");
modelAndView.addObject("resultado", operacao);
return modelAndView; 
}

}

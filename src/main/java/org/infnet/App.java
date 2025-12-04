package org.infnet;

import io.javalin.Javalin;
import org.infnet.service.CalculatorService;

public class App
{
    public static void main( String[] args )
    {
        CalculatorService calculatorService = new CalculatorService();

        Javalin app = Javalin.create().start(8080);

        app.get("/", ctx -> {
            ctx.result("calcDev up and running!...");
        });

        app.get("/add", ctx -> {
            double a = ctx.queryParamAsClass("a", Double.class).get();
            double b = ctx.queryParamAsClass("b", Double.class).get();

            double result = calculatorService.add(a, b);
            ctx.result(String.valueOf(result));
        });

        app.get("/subtract", ctx -> {
            double a = ctx.queryParamAsClass("a", Double.class).get();
            double b = ctx.queryParamAsClass("b", Double.class).get();

            double result = calculatorService.subtract(a, b);
            ctx.result(String.valueOf(result));
        });


        app.get("/multiply", ctx -> {
            double a = ctx.queryParamAsClass("a", Double.class).get();
            double b = ctx.queryParamAsClass("b", Double.class).get();

            double result = calculatorService.multiply(a, b);
            ctx.result(String.valueOf(result));
        });


        app.get("/divide", ctx -> {
            double a = ctx.queryParamAsClass("a", Double.class).get();
            double b = ctx.queryParamAsClass("b", Double.class).get();

            double result = calculatorService.divide(a, b);
            ctx.result(String.valueOf(result));
        });
    }
}


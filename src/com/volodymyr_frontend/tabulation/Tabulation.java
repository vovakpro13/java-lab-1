package com.volodymyr_frontend.tabulation;

import com.volodymyr_frontend.FunctionCalculator;

import java.util.ArrayList;

public record Tabulation(float start, float end, float step) {

    public ArrayList<Float> tabulate(FunctionCalculator functionCalculator) {
        ArrayList<Float> result = new ArrayList<>();

        for (float x = this.start; x < this.end; x += this.step) {
            result.add(functionCalculator.getFunctionResult(x));
        }

        return result;
    }

}

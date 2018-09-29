package com.launchcode.routebuilder.Model;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class BudgetData {

    //hashmap with <month,amount of budget allowed>
    public static LinkedHashMap<String, Integer> budgetPlanner = new LinkedHashMap<String, Integer>();



    //creates LinkedHashMap with zero budgets across the board
    public static void createBudgets() {
        //strings for all the months and Integer of 0
        String jan = "jan";
        String feb = "feb";
        String mar = "mar";
        String apr = "apr";
        String may = "may";
        String jun = "jun";
        String jul = "jul";
        String aug = "aug";
        String sept = "sept";
        String oct = "oct";
        String nov = "nov";
        String dec = "dec";
        Integer startBud = 0;
        budgetPlanner.put(jan, startBud);
        budgetPlanner.put(feb, startBud);
        budgetPlanner.put(mar, startBud);
        budgetPlanner.put(apr, startBud);
        budgetPlanner.put(may, startBud);
        budgetPlanner.put(jun, startBud);
        budgetPlanner.put(jul, startBud);
        budgetPlanner.put(aug, startBud);
        budgetPlanner.put(sept, startBud);
        budgetPlanner.put(oct, startBud);
        budgetPlanner.put(nov, startBud);
        budgetPlanner.put(dec, startBud);
    }

    public static void putToBudget(String month, Integer budget){
        budgetPlanner.put(month, budget);
    }
/*    //add every months budget to the budgetPlanner map after clearing the old version
    public static void addAllBudgets(String string1, Integer int1, String string2, Integer int2,
                                     String string3, Integer int3, String string4, Integer int4,
                                     String string5, Integer int5, String string6, Integer int6,
                                     String string7, Integer int7, String string8, Integer int8,
                                     String string9, Integer int9, String string10, Integer int10,
                                     String string11, Integer int11, String string12, Integer int12) {

        budgetPlanner.clear();
        budgetPlanner.put(string1, int1);
        budgetPlanner.put(string2, int2);
        budgetPlanner.put(string3, int3);
        budgetPlanner.put(string4, int4);
        budgetPlanner.put(string5, int5);
        budgetPlanner.put(string6, int6);
        budgetPlanner.put(string7, int7);
        budgetPlanner.put(string8, int8);
        budgetPlanner.put(string9, int9);
        budgetPlanner.put(string10, int10);
        budgetPlanner.put(string11, int11);
        budgetPlanner.put(string12, int12);

    }*/

    public static LinkedHashMap<String, Integer> returnBudgets() {
        return budgetPlanner;
    }

}

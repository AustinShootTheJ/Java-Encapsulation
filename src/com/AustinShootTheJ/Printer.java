package com.AustinShootTheJ;

// Challenge class

public class Printer {

    private int tonerLevel = 0;
    private double numberOfPagesPrinted = 0;  // will increase every time a print job is done.
    private boolean isDuplex;


    public Printer(int tonerLevel, boolean isDuplex) {

       if(tonerLevel >=0 && tonerLevel <= 100) {
           this.tonerLevel = tonerLevel;
       }

        this.numberOfPagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int fillAmount) {
        if (fillAmount >= 0) {
            if ((this.tonerLevel + fillAmount) >= 0 && (this.tonerLevel + fillAmount) <= 100) {
                this.tonerLevel += fillAmount;
            } else {
                System.out.println("Error filling toner!");
            }
        }else{
            System.out.println("Cannot take toner away!");

        }
    }

    public int printJob(double pages){
        if((this.tonerLevel - pages >= 0)) {
            this.tonerLevel -= pages;
        }else{
            System.out.println("Refil toner before printing this job! You only have " + this.tonerLevel + "% toner left");
            return -1;
        }

        if(isDuplex){
            pages = pages/2;
            pages = Math.round(pages);
        }

        this.numberOfPagesPrinted += pages;



        System.out.println("Job completed!" + pages + " pages printed, " + this.tonerLevel + "% toner remaining, " + this.numberOfPagesPrinted + " total pages printed on this printer!" );
        return 0;
    }

}

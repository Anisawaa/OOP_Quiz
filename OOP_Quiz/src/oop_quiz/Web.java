/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_quiz;

/**
 *
 * @author Nisa
 */
public class Web implements Division {
    private float wscore, cscore, iscore;
    
    public Web (float Wscore, float Cscore, float Iscore) {
        wscore = Wscore;
        cscore = Cscore;
        iscore = Iscore;
    }
    
    public float getWscore() {
        return wscore;
    }
    
    public void setWscore(float wscore) {
        this.wscore = wscore;
    }
    
    public float getCscore() {
        return cscore;
    }
    
    public void setCscore(float cscore) {
        this.cscore = cscore;
    }
    
    public float getIscore() {
        return iscore;
    }
    
    public void setIscore(float iscore) {
        this.iscore = iscore;
    }
    
    @Override
    public float result() {
        return (float) ((wscore*0.4)+(cscore*0.35)+(iscore*0.25));
    }

    public String information(float result) {
        if (result >= 85) {
            return "PASSED";
        }
        
        else {
            return "FAILED";
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_quiz;

/**
 *
 * @author Nisa
 */
public class Android implements Division {
    private float wscore, cscore, iscore;
    
    public Android(float Wscore, float Cscore, float Iscore) {
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
        return (float) ((wscore*0.2)+(cscore*0.5)+(iscore*0.3));
    }

    public String information(float result) {
        if (result >= 85) {
            return "PASSED";
        }
        else {
            return "FAILED\n";
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missiletraj;
/**
 *
 * @author Yt
 */

import java.util.*;

public class Interface {
 
    int values (){
    
        int a;
    
        Random num = new Random();
        
        a = num.nextInt();
        
        return a;
    
    }
    
    int calculateAnsHeight(int x, int y){
    
    //calculate the max height of object function    
    int ans = 0;
    double gravity = 9.8;
    double doubleGravity = gravity*2;
    int vSquared = x*x;
    double sinThetaSquared = Math.sin(y)*Math.sin(y);
    double numerator = vSquared * sinThetaSquared;
    double unsimplifiedAns = numerator/doubleGravity;
    
    // simplify double into integer
    ans = (int) unsimplifiedAns;
    
    //return answer
    return ans;
    
    }
    
    int calculateAnsRange(int x, int y){
    
    // calculate the range that the object will travel    
    int ans = 0;
    double gravity = 9.8;
    int vSquared = x*x;
    double sinTheta = Math.sin(y);
    double twoSinTheta = sinTheta*2;
    double numerator = vSquared*twoSinTheta;
    double unsimplifiedAns = numerator/gravity;
    
    // simplify double into integer
    ans  = (int) unsimplifiedAns;
    
    //return answer
    return ans;
    
    }
    
}

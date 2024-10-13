//    uniCenta oPOS  - Touch Friendly Point Of Sale
//    Copyright (c) 2009-2018 uniCenta
//    https://unicenta.com
//
//    This file is part of uniCenta oPOS
//
//    uniCenta oPOS is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//   uniCenta oPOS is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with uniCenta oPOS.  If not, see <http://www.gnu.org/licenses/>.

package com.unicenta.pos.payment;

import com.unicenta.format.Formats;

public class PaymentInfoFree extends PaymentInfo {
    
    private double m_dTotal;
    private double m_dTendered;
    private String m_dCardName =null;
    private double m_dPaid;
//    private double m_dTip;    
   
    /** Creates a new instance of PaymentInfoFree
     * @param dTotal 
     * @param dPaid
     */
    public PaymentInfoFree(double dTotal, double dPaid) {
        m_dTotal = dTotal;
        m_dPaid = dPaid;
    }

    public PaymentInfo copyPayment(){
        return new PaymentInfoFree(m_dTotal, m_dPaid);
    }    
    public String getTransactionID(){
        return "no ID";
    }
    public String getName() {
        return "free";
    }   
    public double getTotal() {
        return m_dTotal;
    }
    public double getPaid() {
        return (0.0); 
    }

/**
 * 
    public double getTip() {
        return m_dTip;
    }
*/
    
    public double getChange(){
       return (0.00);
   }
    public double getTendered() {
       return m_dTendered;
   }
    public String getCardName() {
       return m_dCardName;
   } 

/**    
    public boolean getIsProcessed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setIsProcessed(boolean value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getReturnMessage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     * @return 
*/
    public String printPaid() {
        return Formats.CURRENCY.formatValue(m_dPaid);
    }
    
    @Override
    public String getVoucher() {
        return null;
    }     

}

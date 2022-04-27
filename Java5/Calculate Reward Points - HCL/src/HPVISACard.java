class HPVISACard extends VISACard{
    public Double computeRewardPoints(String type, Double amount){
    	amount=super.computeRewardPoints(type, amount);
    	if(type.equalsIgnoreCase("Fuel")) {
    		amount=amount+10;
            return amount;
    	}else {
    		return amount;
    	}
    	
    }
}

/**
 * 
 */

var prices = [7,1,5,3,6,4];
function stockBuySell(prices){
	let maxProfit = 0;
	for(let i = 0; i<prices.length; i++){
		for(let j = i+1; j<prices.length; j++){
			let profit = prices[j] - prices[i];
			console.log(profit);
            if (profit > maxProfit)
            	maxProfit = profit;
            	
		}
	}
	return maxProfit;
}

console.log("Best Profit: "+stockBuySell(prices));
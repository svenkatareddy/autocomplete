# autocomplete
autocomplete

For the below data


SKU_ID  	DESCRIPTION  	SKU_GROUP  	WEIGHT  
iPhone6	6th generation Apple Phone	Apple	135
iPhone7	7th generation Apple iPhone	Apple	135
iPhone10	10th generation Apple iPhone	Apple	135
Galaxy S8	S8 generation Samsung	Samsung	135
Galaxy S9	S9 generation Samsung	Samsung	135
Galaxy S20	S20 generation Samsung	Samsung	135
One Plus 7	One plus 7	OnePlus	135
One Plus 8	One plus 8	OnePlus	135
One Plus 8 Pro	One plus 8 Pro	OnePlus	135

Case insensive
http://localhost:8080/api/sku/fetch?text=iphone

Case insensitive
http://localhost:8080/api/sku/fetch?text=iPhone

By brand
http://localhost:8080/api/sku/fetch?text=Apple

By description
http://localhost:8080/api/sku/fetch?text=galaxy

By Exact model
http://localhost:8080/api/sku/fetch?text=iPhone6


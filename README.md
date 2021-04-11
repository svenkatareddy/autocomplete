# autocomplete
autocomplete

**Requirements:**
Write an API to search for SKU's to be displayed based on the search criteria like sku_id, description or brand 

**Data**

 SKU_ID | DESCRIPTION | SKU_GROUP| WEIGHT 
--- | --- | --- | --- 
iPhone6 | 6th generation Apple Phone | Apple | 135 
iPhone7 | 7th generation Apple Phone | Apple | 140 
iPhone10 | 10th generation Apple Phone | Apple | 125 
Galaxy S8 | S8 generation Samsung	 | Samsung | 120 
Galaxy S9 | S9 generation Samsung | Samsung | 125 
Galaxy S20 | 20th generation Apple Phone | Samsung | 142 
One Plus 7 | One plus 7 | OnePlus | 132 
One Plus 8 | One plus 8 | OnePlus | 141 
One Plus 8 Pro | One plus 8 pro | OnePlus | 125 

**Test cases**

Case-insensitive
http://localhost:8080/api/sku/fetch?text=iphone

Case-sensitive
http://localhost:8080/api/sku/fetch?text=iPhone

By brand
http://localhost:8080/api/sku/fetch?text=Apple

By description
http://localhost:8080/api/sku/fetch?text=galaxy

By Exact model
http://localhost:8080/api/sku/fetch?text=iPhone6

No records found
http://localhost:8080/api/sku/fetch?text=asadfd

**Swagger documentations**

# All Utils Services
## Add Char
**Endpoint:** */services/add-char*
<br />
**Description:** This method is responsible to add any desired char. 
<br />
**Request Example:** 
<br />
```json
{
    "text":"1234567",
    "size": 10,
    "newChar" : "0",
    "position":"left"

}
```
**Response Example:** 
```
 00000000001234567
```

## Text Size
**Endpoint:** */services/text-size*
<br />
**Description:** This method is responsible to count the size of a text. 
<br />
**Request Example:** 
<br />
```
Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
```
**Response Example:** 
```
445
```

# Waves wallet generator
This tool generates Waves addresses with 15 word seeds compatible with Waves Lite Client and Waves Full Node. The output is exported to a 'wallet.dat' for the Full Node and to a CSV file, 'addresses.csv', which contains the list of all generated addresses with seeds, private keys and public keys.


## Usage

```
$ java -jar walletgenerator.jar -h
Waves wallet generator 1.0
Usage: walletgenerator [options]

  -c, --count <value>     number of addresses to generate
  --testnet               generate testnet addresses
  -p, --password <value>  wallet password
  -f, --filter <value>    filter addresses with a specific pattern
```	
	
## Examples

```$ java -jar walletgenerator.jar --testnet -c 100 -p mypassword  ```

generate 100 testnet addresses. Output to screen, wallet.dat (encrypted with 'mypassword') and addresses.csv

```$ java -jar walletgenerator.jar -c 1000 -p mypassword -f WAVE   ```

generate 1000 mainnet addresses. Filter only addresses containing the word 'WAVE', output to screen, wallet.dat (encrypted with 'mypassword') and addresses.csv

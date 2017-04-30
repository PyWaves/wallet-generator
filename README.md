# Waves wallet generator
This tool generates Waves addresses with 15 word seeds compatible with Waves Lite Client and Waves Full Node. The output is exported to a 'wallet.dat' for the Full Node and to a CSV file, 'addresses.csv', which contains the list of all generated addresses with seeds, private keys and public keys.


## Usage

```
$ java -jar walletgenerator.jar --help
Waves wallet generator 1.1
Usage: walletgenerator [options]

  -a, --append            append to existing wallet.dat / addresses.csv
  -c, --count <value>     number of addresses to generate
  -t, --testnet           generate testnet addresses
  -p, --password <value>  wallet password
  -f, --filter <value>    filter addresses with a specific pattern
  -s, --case-sensitive    case sensitive filtering
  --help                  prints this help message
```	
	
## Examples

```$ java -jar walletgenerator.jar --testnet -c 100 -p mypassword  ```

generate 100 testnet addresses. Output to screen, wallet.dat (encrypted with 'mypassword') and addresses.csv

```$ java -jar walletgenerator.jar -a -c 100 -p mypassword  ```

generate 100 addresses. Output to screen and append to existing wallet.dat (encrypted with 'mypassword') and addresses.csv

```$ java -jar walletgenerator.jar -c 1000 -p mypassword -f WAVE   ```

generate 1000 mainnet addresses. Filter only addresses containing the word 'WAVE' (case insensitive), output to screen, wallet.dat (encrypted with 'mypassword') and addresses.csv

```$ java -jar walletgenerator.jar -c 1000 -p mypassword -f WAVE -s  ```

same as above but with case sensitive filtering

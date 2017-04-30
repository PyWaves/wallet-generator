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

Generate 3 testnet addresses. Output to screen, wallet.dat and addresses.csv
```
$ java -jar walletgenerator.jar -t -c 3
address #    : 1
seed         : pull assist echo fiscal learn lens feature boil frog banner term enter capable speed tone buddy mobile notable
public key   : 4U6LakyXD21Pz6JjmDys6gEBPihqT1qS4XVZefZ2H6Nq
private key  : 5soX8ym1dZNvupoP9nFNbuUy6S3dDxoEtoakfaHSvLH7
address      : 3MswUSYbZVdYiysaLQmSFzd9mkhJfo83mqN
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 2
seed         : evil hotel logic open ordinary adjust hand glow neither planet mind acquire reunion maximum visual involve fence pumpkin
public key   : 4wB5UkAoTMikTicUpwcc3GbchNjBJCF5k4eYRvKf4igS
private key  : HjJanFFVy5kYVX6qErcYghQHmZNc6iZq9RnYkjULQaUN
address      : 3N4Htq8QkUAwNAuZUD5StDGqCqwhgU9AyhK
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 3
seed         : tone devote ring relief injury sorry cute drive end favorite rather arm host battle drill aspect lounge vivid
public key   : 9GiVbdkZDzUFpAsMamtHXiCqq5yn3Cuke2B3hvEEJDD4
private key  : H9scXQ47Y6ZuukNfYYoo4pzeVDMKWv9VvJM67CqexW3j
address      : 3MuamA5LeQFarEmVYvSdcgzEMCPkeCQVDfP
------------------------------------------------------------------------------------------------------------------------------------------------------
```

Generate 100 mainnet addresses. Output to screen, wallet.dat (encrypted with 'mypassword') and addresses.csv
```
$ java -jar walletgenerator.jar -c 100 -p mypassword  
```

Generate 100 addresses. Output to screen, append to existing wallet.dat (encrypted with 'mypassword') and addresses.csv
```
$ java -jar walletgenerator.jar -a -c 100 -p mypassword  
```

Generate 100000 mainnet addresses, filter addresses containing the word 'WAVE' (case insensitive)
```
$ java -jar walletgenerator.jar -c 100000 -f WAVE   
address #    : 1
seed         : state upset better opera candy jelly shallow clutch jealous lunch laugh tomorrow perfect chuckle orphan salad ball filter
public key   : 6MKTLcaWAVcSqgYAqCrX1WU3eBnHY8J1yFk8Kww6wzmt
private key  : 26XS7rfzXo5RLCxBwAPkuM8tVz5RDVTWCcwvMfWqE2eM
address      : 3PJYrdbdhWaVeZ9MAMAmmSiYxozzbgCpwCH
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 2
seed         : pond limit much good fragile memory labor milk piece year slice system ball awake hurry level rabbit vacant
public key   : 2h5RwgVx8JFBGXFouKCmz564nV3FZhaFzJLTJPAD32B2
private key  : 4HdCJUZaNHqGmhQpHhi2ztokQAzKTpavK52aaYoy5AP1
address      : 3P6yem17BkSKWy27wavEogyzbQ3oo5LpUCi
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 3
seed         : clog melody they edit kite shadow able diet faith okay grow tail gap entire picnic dry chaos glance
public key   : 54Q7nv5dZ3stBoYsCHU8ikPHLwxM3VbRgfAXbKoGBfhS
private key  : HBB4npdpKkDJh5jNv1eu7vX1FHXjkBgagyoCk4nCAmfC
address      : 3PPdLckWAveUmvHUsvsSJeRUxCJxqNGGpfQ
------------------------------------------------------------------------------------------------------------------------------------------------------
```

Same as above but case sensitive
```
$ java -jar walletgenerator.jar -c 100000 -p mypassword -f WAVE -s  
address #    : 1
seed         : legal ostrich sight enter guitar pen stock cattle dose tattoo define gossip author escape mass ten insane surround
public key   : EE76QcW273AAhkQjHhXf4cE211byqACdEHLR2pU4KsJm
private key  : AjM5PK4ACEPoPWeJ24o81Ag7psZgBk9Tz55LR5NDsryV
address      : 3PHhB1CvS6LcHNZSZWAVEv1ZTKDd7rFj9hf
------------------------------------------------------------------------------------------------------------------------------------------------------
address #    : 2
seed         : sail taste drink palm wrist antique few idea moon flat try blossom exist wide alien honey hidden rich
public key   : 9z2Gk2ykSHWJwqBbr2sbohxgP99w8aX57agmfLWDi1nP
private key  : F188SVQneiUmWsV4xJruR2mZVzsvRdWYKG2EWVPidfH9
address      : 3PQAzuDDW9AhBWAVEbijz5Ttp8xv6A298gv
------------------------------------------------------------------------------------------------------------------------------------------------------
```
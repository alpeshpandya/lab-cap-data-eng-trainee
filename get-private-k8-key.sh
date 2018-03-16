#!/bin/bash
KEY_NAME=$1

KEY_VALUE=$(aws ssm get-parameters --names $KEY_NAME --with-decryption --region us-west-2 --profile de_training | jq '.["Parameters"][0]["Value"]' -r)

echo "$KEY_VALUE" >> $KEY_NAME
chmod 400 $KEY_NAME

#!/bin/bash
KEY_NAME=$1
FILE=$2

# #!/bin/bash
# SUB_ACCOUNT_ID="363341246844"
# CMD="$2"
# ASSUME_ROLE="arn:aws:iam::${SUB_ACCOUNT_ID}:role/de_tf_infra_role"
# # uses SUB_ACCOUNT_ID from the environment - easy to re-use in CI Pipeline
# ROLE_SESSION_NAME="GET_KEY_SESSION"
# TMP_FILE=".temp_credentials"
#
# aws sts assume-role --output json --role-arn ${ASSUME_ROLE} --role-session-name ${ROLE_SESSION_NAME} > ${TMP_FILE}
#
# ACCESS_KEY=$(cat ${TMP_FILE} | jq -r ".Credentials.AccessKeyId")
# SECRET_KEY=$(cat ${TMP_FILE} | jq -r ".Credentials.SecretAccessKey")
# SESSION_TOKEN=$(cat ${TMP_FILE} | jq -r ".Credentials.SessionToken")
# EXPIRATION=$(cat ${TMP_FILE} | jq -r ".Credentials.Expiration")
#
# echo "Retrieved temp access key ${ACCESS_KEY} for role ${ASSUME_ROLE}. Key will expire at ${EXPIRATION}"
#
# # cat <<EOF > spec/secrets.yml
# # region: us-east-1
# # aws_access_key_id: ${ACCESS_KEY}
# # aws_secret_access_key: ${SECRET_KEY}
# # EOF
#
#
# AWS_ACCESS_KEY_ID=${ACCESS_KEY} AWS_SECRET_ACCESS_KEY=${SECRET_KEY} AWS_SESSION_TOKEN=${SESSION_TOKEN} ${CMD}
#
#



KEY_VALUE=$(aws ssm get-parameters --names $KEY_NAME --with-decryption --region us-west-2 --profile de_training | jq '.["Parameters"][0]["Value"]' -r)

echo "$KEY_VALUE" > $FILE
chmod 400 $FILE

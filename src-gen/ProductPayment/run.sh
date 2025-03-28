#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.productpayment --module-path aisco.product.productpayment -m aisco.product.productpayment &

wait
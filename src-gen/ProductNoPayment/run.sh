#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.productnopayment --module-path aisco.product.productnopayment -m aisco.product.productnopayment &

wait
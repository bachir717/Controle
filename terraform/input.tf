variable "access_key" {}
variable "secret_key" {}

variable "region" {
    type = string
    description = "aws region where the VM will be provisioned"
    default = "us-east-2"
}

variable "ami" {
    type = string
    description = "aws ami used to provision the VM"
    default = "ami-0fb653ca2d3203ac1"
}

variable "instance_ssh_public_key" {
    type = string
    description = "your ssh public key"
}

data "http" "my_public_ip" {
    url = "https://ifconfig.co/json"
    request_headers = {
        Accept = "application/json"
    }
}

locals {
    my_ip = jsondecode(data.http.my_public_ip.body)
}
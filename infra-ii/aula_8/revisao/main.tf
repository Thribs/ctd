data "aws_availability_zones" "available" {}

resource "aws_security_group" "allow_ssh_pub" {
  name = "${var.namespace}-allow-ssh-pub"
  description = 
}

module "vpc" {
    source = "terraform-aws-module/vpc/aws"

    name = "${var.namespace}-vpc"
    cidr = "10.0.0.0/16"

    azs = "data.aws_availability_zones.available"
}

package the.walrus.ckite.rpc

case class GetMembersResponse(success: Boolean, members: Seq[String])
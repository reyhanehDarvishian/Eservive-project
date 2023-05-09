package com.rahgozin.gate.dto.querySubscriberNew.queryCust.request;//package com.example.demo.request;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//public class BeanToXMLUtil {
//public static Document convertBeanToXML (Envelope envelope) throws Exception {
//Document inputDoc = XMLUtil.createDocument("Envelope");  Element envelopeElm=inputDoc.getDocumentElement();
//
//
//
//Element bodyElm=XMLUtil.createChildElement(envelopeElm,"Body");
//Body body=envelope.getBody();
//
//
//
//Element querySubscriberReqMsgElm=XMLUtil.createChildElement(bodyElm,"querySubscriberReqMsg");
//QuerySubscriberReqMsg querySubscriberReqMsg=body.getQuerySubscriberReqMsg();
//
////
//
//  for (int i=0; i<querySubscriberReqMsg.getQuerySubscriberRequestList().size(); i++ ) {
//QuerySubscriberRequest querySubscriberRequest=querySubscriberReqMsg.getQuerySubscriberRequestList().get(i);
//  Element querySubscriberRequestElm=XMLUtil.createChildElement(querySubscriberReqMsgElm,"querySubscriberRequest");
//
//
//Element includeObjElm=XMLUtil.createChildElement(querySubscriberRequestElm,"includeObj");
//IncludeObj includeObj=querySubscriberRequest.getIncludeObj();
//
//
//
//Element includeContractFlagElm=XMLUtil.createChildElement(includeObjElm,"includeContractFlag");
//IncludeContractFlag includeContractFlag=includeObj.getIncludeContractFlag();
//
//
//
//Element includeHistoryFlagElm=XMLUtil.createChildElement(includeObjElm,"includeHistoryFlag");
//IncludeHistoryFlag includeHistoryFlag=includeObj.getIncludeHistoryFlag();
//
//
//
//Element includeOfferFlagElm=XMLUtil.createChildElement(includeObjElm,"includeOfferFlag");
//IncludeOfferFlag includeOfferFlag=includeObj.getIncludeOfferFlag();
//
//
//
//Element includeProdFlagElm=XMLUtil.createChildElement(includeObjElm,"includeProdFlag");
//IncludeProdFlag includeProdFlag=includeObj.getIncludeProdFlag();
//
//
//
//Element pageQueryElm=XMLUtil.createChildElement(querySubscriberRequestElm,"pageQuery");
//PageQuery pageQuery=querySubscriberRequest.getPageQuery();
//
//
//
//Element pageSizeElm=XMLUtil.createChildElement(pageQueryElm,"pageSize");
//PageSize pageSize=pageQuery.getPageSize();
//
//
//
//Element startNumElm=XMLUtil.createChildElement(pageQueryElm,"startNum");
//StartNum startNum=pageQuery.getStartNum();
//
//
//
//Element totalNumElm=XMLUtil.createChildElement(pageQueryElm,"totalNum");
//TotalNum totalNum=pageQuery.getTotalNum();
//
//
//
//Element queryObjElm=XMLUtil.createChildElement(querySubscriberRequestElm,"queryObj");
//QueryObj queryObj=querySubscriberRequest.getQueryObj();
//
//
//
//Element subAccessCodeElm=XMLUtil.createChildElement(queryObjElm,"subAccessCode");
//SubAccessCode subAccessCode=queryObj.getSubAccessCode();
//
//
//
//Element primaryIdentityElm=XMLUtil.createChildElement(subAccessCodeElm,"primaryIdentity");
//PrimaryIdentity primaryIdentity=subAccessCode.getPrimaryIdentity();
//
//
//
//}//REPEAt elm
//Element requestHeaderElm=XMLUtil.createChildElement(querySubscriberReqMsgElm,"requestHeader");
//RequestHeader requestHeader=querySubscriberReqMsg.getRequestHeader();
//
//
//
//Element accessSecurityElm=XMLUtil.createChildElement(requestHeaderElm,"accessSecurity");
//AccessSecurity accessSecurity=requestHeader.getAccessSecurity();
//
//
//
//Element loginSystemCodeElm=XMLUtil.createChildElement(accessSecurityElm,"loginSystemCode");
//LoginSystemCode loginSystemCode=accessSecurity.getLoginSystemCode();
//
//
//
//Element passwordElm=XMLUtil.createChildElement(accessSecurityElm,"password");
//Password password=accessSecurity.getPassword();
//
//
//
//Element businessCodeElm=XMLUtil.createChildElement(requestHeaderElm,"businessCode");
//BusinessCode businessCode=requestHeader.getBusinessCode();
//
//
//
//Element messageSeqElm=XMLUtil.createChildElement(requestHeaderElm,"messageSeq");
//MessageSeq messageSeq=requestHeader.getMessageSeq();
//
//
//
//Element operatorInfoElm=XMLUtil.createChildElement(requestHeaderElm,"operatorInfo");
//OperatorInfo operatorInfo=requestHeader.getOperatorInfo();
//
//
//
//  for (int j=0; j<operatorInfo.getOperatorIdList().size(); j++ ) {
//OperatorId operatorId=operatorInfo.getOperatorIdList().get(j);
//  Element operatorIdElm=XMLUtil.createChildElement(operatorInfoElm,"operatorId");
//
//
//}//REPEAt elm
//Element ownershipInfoElm=XMLUtil.createChildElement(requestHeaderElm,"ownershipInfo");
//OwnershipInfo ownershipInfo=requestHeader.getOwnershipInfo();
//
//
//
//Element beIdElm=XMLUtil.createChildElement(ownershipInfoElm,"beId");
//BeId beId=ownershipInfo.getBeId();
//
//
//
//Element regionIdElm=XMLUtil.createChildElement(ownershipInfoElm,"regionId");
//RegionId regionId=ownershipInfo.getRegionId();
//
//
//
//Element versionElm=XMLUtil.createChildElement(requestHeaderElm,"version");
//Version version=requestHeader.getVersion();
//
//
//
//Element headerElm=XMLUtil.createChildElement(envelopeElm,"Header");
//Header header=envelope.getHeader();
//
//
//
//
// return inputDoc;
// }
// }
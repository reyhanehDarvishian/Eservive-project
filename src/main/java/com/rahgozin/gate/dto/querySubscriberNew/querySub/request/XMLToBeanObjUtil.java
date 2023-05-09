package com.rahgozin.gate.dto.querySubscriberNew.querySub.request;//package com.example.demo.request;
//
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//
//import java.util.ArrayList;
//import java.util.List;
//public class XMLToBeanObjUtil {
//private static Envelope convertXmlToBeanObject(Document doc ) throws Exception {
//
//		Element envelopeElm = doc.getDocumentElement();Envelope envelope = new Envelope();
//
//
//		Element bodyElm = XMLUtil.getChildElement(envelopeElm, "Body");
//Body body = new Body();
//envelope.setBody(body);
//
//
//		Element querySubscriberReqMsgElm = XMLUtil.getChildElement(bodyElm, "querySubscriberReqMsg");
//QuerySubscriberReqMsg querySubscriberReqMsg = new QuerySubscriberReqMsg();
//body.setQuerySubscriberReqMsg(querySubscriberReqMsg);
//
//
//		List<Element> querySubscriberRequestNdList = XMLUtil.getChildElements(querySubscriberReqMsgElm, "querySubscriberRequest");
//List<QuerySubscriberRequest> querySubscriberRequestList = new ArrayList<QuerySubscriberRequest> ();
//querySubscriberReqMsg.setQuerySubscriberRequestList (querySubscriberRequestList);
//		for (Element querySubscriberRequestElm: querySubscriberRequestNdList) {
//QuerySubscriberRequest querySubscriberRequest = new QuerySubscriberRequest();
//querySubscriberRequestList.add(querySubscriberRequest);
//
//
//		Element includeObjElm = XMLUtil.getChildElement(querySubscriberRequestElm, "includeObj");
//IncludeObj includeObj = new IncludeObj();
//querySubscriberRequest.setIncludeObj(includeObj);
//
//
//		Element includeContractFlagElm = XMLUtil.getChildElement(includeObjElm, "includeContractFlag");
//IncludeContractFlag includeContractFlag = new IncludeContractFlag();
//includeObj.setIncludeContractFlag(includeContractFlag);
//
//
//		Element includeHistoryFlagElm = XMLUtil.getChildElement(includeObjElm, "includeHistoryFlag");
//IncludeHistoryFlag includeHistoryFlag = new IncludeHistoryFlag();
//includeObj.setIncludeHistoryFlag(includeHistoryFlag);
//
//
//		Element includeOfferFlagElm = XMLUtil.getChildElement(includeObjElm, "includeOfferFlag");
//IncludeOfferFlag includeOfferFlag = new IncludeOfferFlag();
//includeObj.setIncludeOfferFlag(includeOfferFlag);
//
//
//		Element includeProdFlagElm = XMLUtil.getChildElement(includeObjElm, "includeProdFlag");
//IncludeProdFlag includeProdFlag = new IncludeProdFlag();
//includeObj.setIncludeProdFlag(includeProdFlag);
//
//
//		Element pageQueryElm = XMLUtil.getChildElement(querySubscriberRequestElm, "pageQuery");
//PageQuery pageQuery = new PageQuery();
//querySubscriberRequest.setPageQuery(pageQuery);
//
//
//		Element pageSizeElm = XMLUtil.getChildElement(pageQueryElm, "pageSize");
//PageSize pageSize = new PageSize();
//pageQuery.setPageSize(pageSize);
//
//
//		Element startNumElm = XMLUtil.getChildElement(pageQueryElm, "startNum");
//StartNum startNum = new StartNum();
//pageQuery.setStartNum(startNum);
//
//
//		Element totalNumElm = XMLUtil.getChildElement(pageQueryElm, "totalNum");
//TotalNum totalNum = new TotalNum();
//pageQuery.setTotalNum(totalNum);
//
//
//		Element queryObjElm = XMLUtil.getChildElement(querySubscriberRequestElm, "queryObj");
//QueryObj queryObj = new QueryObj();
//querySubscriberRequest.setQueryObj(queryObj);
//
//
//		Element subAccessCodeElm = XMLUtil.getChildElement(queryObjElm, "subAccessCode");
//SubAccessCode subAccessCode = new SubAccessCode();
//queryObj.setSubAccessCode(subAccessCode);
//
//
//		Element primaryIdentityElm = XMLUtil.getChildElement(subAccessCodeElm, "primaryIdentity");
//PrimaryIdentity primaryIdentity = new PrimaryIdentity();
//subAccessCode.setPrimaryIdentity(primaryIdentity);
//
//
//}
//		Element requestHeaderElm = XMLUtil.getChildElement(querySubscriberReqMsgElm, "requestHeader");
//RequestHeader requestHeader = new RequestHeader();
//querySubscriberReqMsg.setRequestHeader(requestHeader);
//
//
//		Element accessSecurityElm = XMLUtil.getChildElement(requestHeaderElm, "accessSecurity");
//AccessSecurity accessSecurity = new AccessSecurity();
//requestHeader.setAccessSecurity(accessSecurity);
//
//
//		Element loginSystemCodeElm = XMLUtil.getChildElement(accessSecurityElm, "loginSystemCode");
//LoginSystemCode loginSystemCode = new LoginSystemCode();
//accessSecurity.setLoginSystemCode(loginSystemCode);
//
//
//		Element passwordElm = XMLUtil.getChildElement(accessSecurityElm, "password");
//Password password = new Password();
//accessSecurity.setPassword(password);
//
//
//		Element businessCodeElm = XMLUtil.getChildElement(requestHeaderElm, "businessCode");
//BusinessCode businessCode = new BusinessCode();
//requestHeader.setBusinessCode(businessCode);
//
//
//		Element messageSeqElm = XMLUtil.getChildElement(requestHeaderElm, "messageSeq");
//MessageSeq messageSeq = new MessageSeq();
//requestHeader.setMessageSeq(messageSeq);
//
//
//		Element operatorInfoElm = XMLUtil.getChildElement(requestHeaderElm, "operatorInfo");
//OperatorInfo operatorInfo = new OperatorInfo();
//requestHeader.setOperatorInfo(operatorInfo);
//
//
//		List<Element> operatorIdNdList = XMLUtil.getChildElements(operatorInfoElm, "operatorId");
//List<OperatorId> operatorIdList = new ArrayList<OperatorId> ();
//operatorInfo.setOperatorIdList (operatorIdList);
//		for (Element operatorIdElm: operatorIdNdList) {
//OperatorId operatorId = new OperatorId();
//operatorIdList.add(operatorId);
//
//
//}
//		Element ownershipInfoElm = XMLUtil.getChildElement(requestHeaderElm, "ownershipInfo");
//OwnershipInfo ownershipInfo = new OwnershipInfo();
//requestHeader.setOwnershipInfo(ownershipInfo);
//
//
//		Element beIdElm = XMLUtil.getChildElement(ownershipInfoElm, "beId");
//BeId beId = new BeId();
//ownershipInfo.setBeId(beId);
//
//
//		Element regionIdElm = XMLUtil.getChildElement(ownershipInfoElm, "regionId");
//RegionId regionId = new RegionId();
//ownershipInfo.setRegionId(regionId);
//
//
//		Element versionElm = XMLUtil.getChildElement(requestHeaderElm, "version");
//Version version = new Version();
//requestHeader.setVersion(version);
//
//
//		Element headerElm = XMLUtil.getChildElement(envelopeElm, "Header");
//Header header = new Header();
//envelope.setHeader(header);
//
//
//
// return envelope;
// }
// }
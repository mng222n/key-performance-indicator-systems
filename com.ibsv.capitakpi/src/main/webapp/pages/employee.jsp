<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
</head>
 
<body>
<h1>Capita KPI Web Portal</h1>

<h2>Add Employee</h2>
<s:form action="addEmployeeAction" >
  <s:textfield name="name" label="Name" value="" />
  <s:textarea name="division" label="Division" value="" cols="50" rows="5" />
  <s:submit />
</s:form>

<h2>All Employees</h2>

<s:if test="employeeList.size() > 0">
<table border="1px" cellpadding="8px">
	<tr>
		<th>Employee Id</th>
		<th>Name</th>
		<th>Division</th>
		<th>Start Date</th>
	</tr>
	<s:iterator value="employeeList" status="userStatus">
		<tr>
			<td><s:property value="employeeId" /></td>
			<td><s:property value="name" /></td>
			<td><s:property value="division" /></td>
			<td><s:date name="startDate" format="dd/MM/yyyy" /></td>
		</tr>
	</s:iterator>
</table>
</s:if>
<br/>
<br/>

</body>
</html>
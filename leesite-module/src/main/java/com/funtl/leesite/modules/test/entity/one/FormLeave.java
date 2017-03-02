/*
 * Copyright 2015-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.funtl.leesite.modules.test.entity.one;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.funtl.leesite.common.persistence.DataEntity;
import com.funtl.leesite.common.utils.excel.annotation.ExcelField;
import com.funtl.leesite.modules.sys.entity.Area;
import com.funtl.leesite.modules.sys.entity.Office;
import com.funtl.leesite.modules.sys.entity.User;

/**
 * 员工请假Entity
 *
 * @author Lusifer
 * @version 2016-06-22
 */
public class FormLeave extends DataEntity<FormLeave> {

	private static final long serialVersionUID = 1L;
	private User tuser;        // 员工
	private Office office;        // 归属部门
	private Area area;        // 归属区域
	private Date beginDate;        // 请假开始日期
	private Date endDate;        // 请假结束日期

	public FormLeave() {
		super();
	}

	public FormLeave(String id) {
		super(id);
	}

	@NotNull(message = "员工不能为空")
	@ExcelField(title = "员工", fieldType = User.class, value = "tuser.name", align = 2, sort = 1)
	public User getTuser() {
		return tuser;
	}

	public void setTuser(User tuser) {
		this.tuser = tuser;
	}

	@NotNull(message = "归属部门不能为空")
	@ExcelField(title = "归属部门", fieldType = Office.class, value = "office.name", align = 2, sort = 2)
	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	@ExcelField(title = "归属区域", fieldType = Area.class, value = "area.name", align = 2, sort = 3)
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message = "请假开始日期不能为空")
	@ExcelField(title = "请假开始日期", align = 2, sort = 4)
	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message = "请假结束日期不能为空")
	@ExcelField(title = "请假结束日期", align = 2, sort = 5)
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
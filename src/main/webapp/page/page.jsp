<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container">
    <nav aria-label="Page navigation">
        <ul class="pagination">
            <li>
                <a href="javascript:search(1);" aria-label="Previous">
                    <span aria-hidden="true">&laquo;</span>
                </a>
            </li>
            <c:choose>
                <c:when test="${pageInfo.pages > 5 && pageInfo.pageNum>3}">
                    <c:forEach begin="${pageInfo.pageNum-3}" end="${pageInfo.pageNum+3}" varStatus="i">
                        <c:if test="${i.index >= 1 && i.index <= pageInfo.pages}">
                            <c:choose>
                                <c:when test="${i.index eq pageInfo.pageNum}">
                                    <li class="active"><a href="javascript:">${i.index}</a></li>
                                </c:when>
                                <c:otherwise>
                                    <li><a href="javascript:search(${i.index});">${i.index}</a></li>
                                </c:otherwise>
                            </c:choose>
                        </c:if>
                    </c:forEach>
                </c:when>
                <c:when test="${pageInfo.pages > 5 && pageInfo.pageNum<=3}">
                    <c:forEach begin="1" end="5" varStatus="i">
                        <c:if test="${i.index >= 1 && i.index <= pageInfo.pages}">
                            <c:choose>
                                <c:when test="${i.index eq pageInfo.pageNum}">
                                    <li class="active"><a href="javascript:">${i.index}</a></li>
                                </c:when>
                                <c:otherwise>
                                    <li><a href="javascript:search(${i.index});">${i.index}</a></li>
                                </c:otherwise>
                            </c:choose>
                        </c:if>
                    </c:forEach>
                </c:when>
                <c:otherwise>
                    <c:forEach begin="1" end="${pageInfo.pages}" varStatus="j">
                        <c:choose>
                            <c:when test="${j.index eq pageInfo.pageNum}">
                                <li class="active"><a href="javascript:search(${j.index});">${j.index}</a></li>
                            </c:when>
                            <c:otherwise>
                                <li><a href="javascript:search(${j.index});">${j.index}</a></li>
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>
                </c:otherwise>
            </c:choose>

            <li>
                <a href="javascript:search(${pageInfo.pages});" aria-label="Next">
                    <span aria-hidden="true">&raquo;</span>
                </a>
            </li>
        </ul>
    </nav>
</div>

package com.water.Mulbburi.common.paging;

public class Pagenation {

	public static SelectCriteria getSelectCriteria(int page, int totalCount, int limit, int buttonAmount) {
		
        int maxPage;
        int startPage;
        int endPage;
        int startRow;
        int endRow;
		
        /* 총 페이지수 계산 */
        maxPage = (int) Math.ceil((double) totalCount / limit);

        /* 현재 페이지에 보여줄 시작 페이지 수 */
        startPage = (int) (Math.ceil((double) page / buttonAmount) - 1) * buttonAmount + 1;

        /* 목록 아래쪽에 보여질 마지막 페이지 수  */
        endPage = startPage + buttonAmount - 1;

        /* max 페이지가 더 작은 경우 마지막 페이지가 max 페이지이다. */
        if(maxPage < endPage){
            endPage = maxPage;
        }

        /* 마지막 페이지는 0이 될 수 없기 때문에 게시물이 아무 것도 존재하지 않으면 max페이지와 endPage는 0이 된다. */
        if(maxPage == 0 && endPage == 0) {
            maxPage = startPage;
            endPage = startPage;
        }

        /* 조회할 시작 번호와 마지막 행 번호를 계산 */
        startRow = (page - 1) * limit + 1;
        endRow = startRow + limit - 1;        
        
        SelectCriteria selectCriteria = new SelectCriteria(page, totalCount, limit, buttonAmount, maxPage, startPage, endPage, startRow, endRow);

		return selectCriteria;
	}
	
}

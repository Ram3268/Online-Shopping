$(function() {

	//solving active menu problem

	switch(menu){
	case 'About' :
		$('#about').addClass('active');
		break;
	case 'Contact' :
		$('#contacts').addClass('active');
		break;
	case 'All Products' :
		$('#listProducts').addClass('active');
		break;
	default:
		$('#listProducts').addClass('active');
	$('#a_'+menu).addClass('active');
	break;
	}


	//code for jQuery data Table


	var $table =$('#productListTable');

	//execute the table only when we have this table

	if($table.length){
		
		
		var jsonUrl = '';
		if(window.categoryId== ''){
			jsonUrl = window.contextRoot + "/json/data/all/products";
		}
		else{
			jsonUrl = window.contextRoot + "/json/data/"+window.categoryId+"/products";
		}

		$table.DataTable({

			lengthMenu : [ [ 3, 5, 10, -1 ],
				[ '3 Records', '5 Records', '10 Records', 'ALL' ] ],
				pageLength : 5,
				
				ajax: {
					url: jsonUrl,
					dataSrc: '',
					
				},
				columns: [
					
					{data:'name'},
					{data : 'brand'},
					{data : 'quantity'},
					{data : 'unitPrice'}
				]
		})
	}
})
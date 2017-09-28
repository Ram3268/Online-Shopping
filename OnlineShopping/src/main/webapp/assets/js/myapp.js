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
})
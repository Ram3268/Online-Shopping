$(function() {

	//solving active menu problem

	switch(menu){
	case 'About' :
		$('#about').addClass('active');
		break;
	case 'Contact' :
		$('#contacts').addClass('active');
		break;
	case 'Contact' :
		$('#products').addClass('active');
		break;
	default:
		$('#home').addClass('active');
	}
})
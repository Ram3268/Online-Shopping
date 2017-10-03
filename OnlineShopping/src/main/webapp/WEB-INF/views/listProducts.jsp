<div class="container">

	<div class="row">
		<!-- would display sidebar -->
		<div class="col-mid-3">

			<%@ include file="./shared/sidebar.jsp"%>
		</div>

		<!-- To display actual product -->
		<div class="col-md-9">

			<div class="row">

				<div class="col-lg-12">

					<c:if test="${userClickAllProducts == true}">

						<script>
							
								window.categoryId= '${category.id}';
							</script>
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home"></a></li>
							<li class="active">ALL PRODUCTS</li>

						</ol>
					</c:if>

					<c:if test="${userClickCategoryProducts == true}">
						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home"></a></li>
							<li class="active">CATEGORY</li>
							<li class="active">${category.name}</li>

						</ol>
					</c:if>
				</div>

			</div>
			<div class="row">

				<div class="col-xs-12">


					<table id="productListTable"
						class="table table-striped table-borderd">


						<thead>

							<tr>
								
								<th>Name</th>
								<th>Brand</th>
								<th>Quantity</th>
								<th>Price</th>
							</tr>

						</thead>


						<tfoot>

							<tr>
								
								<th>Name</th>
								<th>Brand</th>
								<th>Quantity</th>
								<th>Price</th>
							</tr>

						</tfoot>
					</table>

				</div>

			</div>


		</div>
	</div>

</div>
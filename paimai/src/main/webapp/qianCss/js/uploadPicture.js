//把图片放入左边边的img中
   		function put(data) {
   			picture = data;
   			$("#url1").val(data.value);

   			showImage(data);
   		}
   		function showImage(obj) {

   			var newPreview = document.getElementById("Images");
   			if (obj) {
   				//ie
   				if (window.navigator.userAgent.indexOf("MSIE") >= 1) {
   					obj.select();
   					newPreview.style.filter = "progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale);";
   					newPreview.filters
   							.item("DXImageTransform.Microsoft.AlphaImageLoader").src = document.selection
   							.createRange().text;
   					return;
   				}
   				//firefox
   				else if (window.navigator.userAgent.indexOf("Chrome") >= 1) {
   					if (obj.files) {
   						newPreview.src = window.URL.createObjectURL(obj.files
   								.item(0));
   						return;
   					}
   					newPreview.src = obj.value;
   					return;
   				}else if (window.navigator.userAgent.indexOf("Firefox") >= 1) {
   					if (obj.files) {
   						newPreview.src = window.URL.createObjectURL(obj.files
   								.item(0));
   						return;
   					}
   					newPreview.src = obj.value;
   					return;
   				}
   				newPreview.src = obj.value;
   				return;
   			}
   			
   		}
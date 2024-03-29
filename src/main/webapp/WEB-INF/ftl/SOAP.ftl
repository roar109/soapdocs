<!DOCTYPE html>
<html>

    <head>
        <title>${model.name!}</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
        <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
              rel="stylesheet" type="text/css">
        <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
              rel="stylesheet" type="text/css">
    </head>

    <body>
        <div class="navbar navbar-default navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#"><span>Brand</span></a>
                </div>
            </div>
        </div>
        <div class="section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="page-header" contenteditable="true">
                            <h1>${model.name}</h1>
                            <h1>
                                <small>${model.location}</small>
                            </h1>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="section">
            <div class="container">
                <div class="panel-group" role="tablist" id="accordion">

                    <#list model.operations as operation>
                       <div class="panel panel-default">
                           <div class="panel-heading" role="tab" id="headingOne">
                               <h4 class="panel-title">
                                   <a data-toggle="collapse" data-parent="#accordion" href="#collapseOne"
                                      aria-expanded="false" aria-controls="collapseOne">
                                       <h3><b>Operation: </b></b>${operation.name}</h3>
                                   </a>
                               </h4>
                           </div>
                           <div id="collapseOne" class="panel-collapse collapse in" role="tabpanel"
                                aria-labelledby="headingOne">
                               <div class="panel-body">
                                   <div class="row">
                                       <div class="col-md-6">
                                           <h3>Input:</h3>
                                           <h3 class="text-primary">
                                               <b>${operation.input.name}</b>
                                           </h3>
                                           <div class="row">
                                               <div class="col-md-6">
                                                   <h4>Type:</h4>
                                                   <#list operation.input.elements as inputElement>
                                                   <div class="row">
                                                       <div class="col-md-6">
                                                            <#if inputElement.name??>
                                                                <h4 class="text-primary">${inputElement.name}</h4>
                                                            </#if>
                                                            <#if inputElement.type??>
                                                               <p class="text-success">${inputElement.type}</p>
                                                            </#if>
                                                       </div>
                                                   </div>
                                                   </#list>
                                               </div>
                                           </div>
                                       </div>
                                       <div class="col-md-6">
                                           <h3>Output: </h3>
                                           <h3 class="text-primary">
                                               <b>${operation.output.name}</b>
                                           </h3>
                                           <div class="row">
                                               <div class="col-md-6">
                                                   <h4>Type:</h4>
                                                   <#list operation.output.elements! as outputElement>
                                                      <div class="row">
                                                          <div class="col-md-6">
                                                              <h4 class="text-primary">${outputElement.name}</h4>
                                                              <a data-toggle="modal" data-target="#${operation.output.name}">
                                                                  <p class="text-success">${outputElement.type}</p>
                                                              </a>
                                                          </div>
                                                      </div>
                                                   </#list>
                                               </div>
                                           </div>
                                       </div>
                                   </div>
                               </div>
                           </div>
                       </div>
                    </#list>
                    <!-- End operation list -->
                </div>
            </div>
        </div>

         <!-- For each ComplexType -->
         <#list model.types?keys as key>
         
           <div id="${key}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" class="modal fade">
               <div class="modal-dialog" role="document">
                   <div class="modal-content">

                       <div class="modal-header">
                           <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                               <span aria-hidden="true">x</span>
                           </button>
                           <h4 class="modal-title" id="myModalLabel">${key}</h4>
                       </div>

                      <div class="modal-body">
                           <#if model.types[key].elements?has_content>
                                    <p>Elements:</p>
                                    <#list model.types[key].elements as element>
                                       <div class="row">
                                       <div class="col-md-6">
                                          <ul class="list-group">
                                            <li class="list-group-item"><b>Name:</b> ${element.name}</li>
                                            <li class="list-group-item"><b>Type:</b> ${element.type}</li>
                                            <li class="list-group-item"><b>MinOccurs:</b> ${element.minOccurs}</li>
                                            <li" class="list-group-item"><b>MaxOccurs:</b> ${element.maxOccurs}</li>
                                          </ul>
                                         </div>
                                       </div>
                                    </#list>
                           </#if>
                           <!-- Ends Each Element -->
                       </div>
                       
                       <div class="modal-footer">
                           <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                       </div>

                   </div>
               </div>
           </div>
           
        </#list>

    </body>
</html>
<form action="/add-task" method="post">
  <div class="row">
    <div class="col-12">
      <label>NAME : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <input type="text" class="form-control" name = "book_name">
    </div>
  </div>
  <div class="row mt-3">
    <div class="col-12">
      <label>DESCRIPTION : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <textarea name="book_description" class="form-control" rows="5"></textarea>
    </div>
  </div>

  <div class="row mt-3">
    <div class="col-12">
      <label>DEADLINE : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <input type="date" class="form-control" name = "task_deadlineDate">
    </div>
  </div>

  <div class="row mt-3">
    <div class="col-12">
      <label>STATUS : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <select class="form-select" name="task_isCompleted">
        <option>YES</option>
        <option>NO</option>
      </select>
    </div>
  </div>

  <div class="row mt-3">
    <div class="col-12">
      <button class="btn btn-primary">SAVE</button>
    </div>
  </div>
</form>
databaseChangeLog {
  changeSet(id: '1539698971671-1', author: 'nelson (generated)') {
    createTable(tableName: 'TestTable') {
      column(name: 'id', type: 'BIGINT', autoIncrement: true) {
        constraints(primaryKey: true, primaryKeyName: 'TestTablePK')
      }
      column(name: 'anotherProperty', type: 'VARCHAR(255)')
      column(name: 'name', type: 'VARCHAR(255)')
    }
  }

}

import androidx.test.runner.AndroidJUnit4;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C__1686674629 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(WorkManagerImpl.class);
      WorkDatabase var3 = ((WorkManagerImpl)var2).getWorkDatabase();
      SystemIdInfoDao var4 = var3.systemIdInfoDao();
      Object var1 = EasyMock.createMock(SystemIdInfo.class);
      var4.insertSystemIdInfo((SystemIdInfo)var1);
   }
}

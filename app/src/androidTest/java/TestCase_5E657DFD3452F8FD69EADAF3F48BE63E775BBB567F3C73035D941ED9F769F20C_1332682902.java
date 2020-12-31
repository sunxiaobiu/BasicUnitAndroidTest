import androidx.test.runner.AndroidJUnit4;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.SystemIdInfoDao;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E657DFD3452F8FD69EADAF3F48BE63E775BBB567F3C73035D941ED9F769F20C_1332682902 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(WorkManagerImpl.class);
      WorkDatabase var2 = ((WorkManagerImpl)var1).getWorkDatabase();
      SystemIdInfoDao var3 = var2.systemIdInfoDao();
   }
}

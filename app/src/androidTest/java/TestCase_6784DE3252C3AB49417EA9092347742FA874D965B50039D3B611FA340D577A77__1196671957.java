import android.content.IntentFilter;
import android.content.IntentFilter.AuthorityEntry;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6784DE3252C3AB49417EA9092347742FA874D965B50039D3B611FA340D577A77__1196671957 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ResolveInfo.class);
      IntentFilter var3 = ((ResolveInfo)var2).filter;
      Iterator var4 = var3.authoritiesIterator();
      var2 = var4.next();
      AuthorityEntry var5 = (AuthorityEntry)var2;
      Object var1 = EasyMock.createMock(Uri.class);
      var5.match((Uri)var1);
   }
}

import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.os.PatternMatcher;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6784DE3252C3AB49417EA9092347742FA874D965B50039D3B611FA340D577A77__1563010750 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ResolveInfo.class);
      IntentFilter var2 = ((ResolveInfo)var1).filter;
      Iterator var3 = var2.pathsIterator();
      var1 = var3.next();
      PatternMatcher var4 = (PatternMatcher)var1;
      String var5 = var4.getPath();
   }
}

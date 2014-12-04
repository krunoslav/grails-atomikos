package com.chat.hibernate4.transactions;

import com.atomikos.icatch.jta.UserTransactionImp;
import org.hibernate.engine.transaction.internal.jta.JtaTransactionFactory;
import java.util.Properties;
import com.atomikos.logging.Logger;
import com.atomikos.logging.LoggerFactory;
import org.hibernate.HibernateException;
import javax.transaction.UserTransaction;

/**
 * Created by kruno on 12/3/14.
 */
public class JTATransactionFactory extends JtaTransactionFactory{
/*
    private static final Logger LOGGER = LoggerFactory.createLogger(JTATransactionFactory.class);
    private UserTransaction userTransaction;

    public void configure(Properties props)
            throws HibernateException
    {
        try
        {
            super.configure(props);
        }
        catch (Exception e) {
            String msg = "Hibernate: error during config - ignore for hibernate 3.2.7 or higher";
            if (LOGGER.isDebugEnabled()) LOGGER.logDebug(msg, e);
        }
    }

    protected UserTransaction getUserTransaction()
    {
        if (this.userTransaction == null) {
            this.userTransaction = new UserTransactionImp();
        }
        return this.userTransaction;
    }
*/
}

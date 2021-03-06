:title Checkout flow
:frontpage
:category flows
:body

The checkout flow is used for purchase. It requires a logged in user, so it will start of in the [auth flow](/flows/auth-flow/).

**URL Path**: /flow/checkout

## How it works
The checkout flow can be just a few steps, or it can be more. It depends on the current state of the user, client configuration, and query parameters.

It starts with the auth flow, and then appends the following steps.

* Choose product in campaign, only shown when `campaign_id` is supplied, and `product_id` is not
* Choose product, only shown when `product_id` is not supplied
* Choose payment method
* Enter payment details, only shown if user chooses new payment method
* Process payment
* Receipt, optional, default enabled

Flow is initiated by path `/flow/checkout` and require query parameters `client_id`, `redirect_uri` and `response_type`.
Optional query parameters include, among others, `campaign_id`, `product_id`, `cancel_redirect_uri`.


## How it looks
Client teaser and Custom CSS is applied to all of the steps. See [Flows](/flows/flows/) for more info.